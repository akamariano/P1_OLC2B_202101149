package intepreter

import (
	"fmt"
	"proy1/parser"
	"strconv"
	"strings"
)

func (v *Visitor) VisitDigitExpr(ctx *parser.DigitExprContext) interface{}{
	digit := ctx.DIGIT_PRIMITIVE().GetText()
	if strings.Contains(digit, ".") {
		f, _ := strconv.ParseFloat(digit, 64)
		fmt.Println("Float Prim: ", f)
		return &floatPrimitive{Value: f}
	} else { // Corrected placement of else
		i, _ := strconv.ParseInt(digit, 10, 64)
		fmt.Println("Int Prim: ", i)
		return &intPrimitive{Value: i}
	}
}

func (v *Visitor) VisitStringExpr(ctx *parser.StringExprContext) interface{}{
	str := strings.Trim(ctx.GetText(), "\"")
	fmt.Println("String Prim: ", str)
	return &stringPrimitive{Value: str}
}
