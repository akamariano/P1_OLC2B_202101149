package intepreter

import (
	"fmt"
	"proy1/parser"
)

func (v *Visitor) VisitPrintExpr(ctx *parser.PrintExprContext) interface{} {
	expr := v.Visit(ctx.Expr()).(PRIMITIVE)
	fmt.Println(expr.GetValue())
	return nil
}

