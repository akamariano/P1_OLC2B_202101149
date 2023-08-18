package intepreter

import (
	"log"
	"proy1/parser"
	"github.com/antlr4-go/antlr/v4"
	"fmt"
)

func NewVisitor() *Visitor {
	return &Visitor{
		Memory: make(map[string]Symbol),
	}
}
//Visit
func(v *Visitor) Visit(tree antlr.ParseTree) interface{}{
	switch val := tree.(type) {
	case *antlr.ErrorNodeImpl:
		log.Fatal(val.GetText())
		return nil
	
default:
	node := tree.Accept(v)
	return node
}
}
func (v *Visitor) VisitStart(ctx *parser.StartContext) interface{}{
	return v.Visit(ctx.Block())
}
//Visit Block
func(v *Visitor) VisitBlock(ctx *parser.BlockContext) interface{}{
	for _, stmt := range ctx.AllStmts() {
		v.Visit(stmt)
	}
	return nil
}

//visit stmts
func (v *Visitor) VisitStmts(ctx *parser.StmtsContext) interface{}{
    //verify if the stmt which is being visited is a declaration
    if ctx.Declaration() != nil {
        fmt.Println("Declaration Visitando")
        return v.Visit(ctx.Declaration())
    }
    return nil
}
func (v *Visitor) VisitPrintExpr(ctx *parser.PrintExprContext) interface{} {
	return v.Visit(ctx.Expr())
}