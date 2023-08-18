package intepreter
import (
	"proy1/parser"
	"fmt"
	
)
func(v *Visitor) VisitTypeValueDeclaration(ctx *parser.TypeValueDeclarationContext) interface{}{
	varId := ctx.ID_PRIMITIVE().GetText()
	
	//varType := ctx.Type_declaration().GetText() //var - let
	//Get the primitive value grammar
	//primitiveValue := ctx.Type_().GetText()
	//Get the value of the primitive
	primitive := v.Visit(ctx.Expr()).(PRIMITIVE)
	//if primitiveValue == FloatType && primitive.GetType() == IntType{
	//	return &floatPrimitive{Value: float64(primitive.GetValue().(int64))}
	//}
	
	v.Memory[varId] = Symbol{
		Line: ctx.GetStart().GetLine(),
		Value: primitive,
		Column: ctx.GetStart().GetColumn(),
	}
	fmt.Println("Memory: ", v.Memory)
	return nil
}