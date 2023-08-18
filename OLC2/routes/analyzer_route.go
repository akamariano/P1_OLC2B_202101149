package routes
import (
	"github.com/gofiber/fiber/v2"
	"fmt"
	"github.com/antlr4-go/antlr/v4"
	"proy1/parser"
	"proy1/intepreter"
)
func Analyzer(params string) fiber.Handler {
	return func(c *fiber.Ctx) error {
		code := string(c.Body())
		fmt.Println(code)
		input := antlr.NewInputStream(code)
		lexer := parser.NewGrammarLexer(input)
		tokens := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
		p := parser.NewGrammarParser(tokens)
		p.BuildParseTrees = true
		tree := p.Start_()
		visitor := intepreter.NewVisitor()
		visitor.Visit(tree)
		return c.SendString("Analyzer2")
	}
}