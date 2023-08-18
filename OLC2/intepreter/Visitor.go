package intepreter

import (
	"proy1/parser"
	
)

type Symbol struct {
	Line int
	Column int
	Value interface{}
	Type string
}
type Visitor struct {
	parser.BaseGrammarVisitor
	Memory map[string]Symbol //Map = Dictionary

}

