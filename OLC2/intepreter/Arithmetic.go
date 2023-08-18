package intepreter

import (
	"proy1/parser"
	"fmt"
)
func (v *Visitor) VisitParenthesisExpr(ctx *parser.ParenthesisExprContext) interface{} {
	expr := v.Visit(ctx.Expr()).(PRIMITIVE)
	return expr
}
func (v *Visitor) VisitArithmeticOperationExpr(ctx *parser.ArithmeticOperationExprContext) interface{} {
	leftValue := v.Visit(ctx.GetLeft()).(PRIMITIVE)
	rightValue := v.Visit(ctx.GetRight()).(PRIMITIVE)
	sign := ctx.GetOp().GetText()
	switch sign {
	case "+":
		switch leftValue.(type) {
		case *intPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*intPrimitive).Value + rightValue.(*intPrimitive).Value
				fmt.Println("Suma de dos enteros:", result)
				return &intPrimitive{Value: result}
			case *floatPrimitive:
				result := float64(leftValue.(*intPrimitive).Value) + rightValue.(*floatPrimitive).Value
				fmt.Println("Suma de entero y flotante:", result)
				return &floatPrimitive{Value: result}
			case *stringPrimitive:
				result := fmt.Sprintf("%v%v", leftValue.GetValue(), rightValue.GetValue())
				fmt.Println("Concatenación de entero y cadena:", result)
				return &stringPrimitive{Value: result}
			}
		case *floatPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*floatPrimitive).Value + float64(rightValue.(*intPrimitive).Value)
				fmt.Println("Suma de flotante y entero:", result)
				return &floatPrimitive{Value: result}
			case *floatPrimitive:
				result := leftValue.(*floatPrimitive).Value + rightValue.(*floatPrimitive).Value
				fmt.Println("Suma de dos flotantes:", result)
				return &floatPrimitive{Value: result}
			case *stringPrimitive:
				result := fmt.Sprintf("%v%v", leftValue.GetValue(), rightValue.GetValue())
				fmt.Println("Concatenación de flotante y cadena:", result)
				return &stringPrimitive{Value: result}
			}
		case *stringPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := fmt.Sprintf("%v%v", leftValue.GetValue(), rightValue.GetValue())
				fmt.Println("Concatenación de cadena y entero:", result)
				return &stringPrimitive{Value: result}
			case *floatPrimitive:
				result := fmt.Sprintf("%v%v", leftValue.GetValue(), rightValue.GetValue())
				fmt.Println("Concatenación de cadena y flotante:", result)
				return &stringPrimitive{Value: result}
			case *stringPrimitive:
				result := fmt.Sprintf("%v%v", leftValue.GetValue(), rightValue.GetValue())
				fmt.Println("Concatenación de dos cadenas:", result)
				return &stringPrimitive{Value: result}
			}
		}

	case "-":
		switch leftValue.(type) {
		case *intPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*intPrimitive).Value - rightValue.(*intPrimitive).Value
				fmt.Println("Resta de dos enteros:", result)
				return &intPrimitive{Value: result}
			case *floatPrimitive:
				result := float64(leftValue.(*intPrimitive).Value) - rightValue.(*floatPrimitive).Value
				fmt.Println("Resta de entero y flotante:", result)
				return &floatPrimitive{Value: result}
			}
		case *floatPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*floatPrimitive).Value - float64(rightValue.(*intPrimitive).Value)
				fmt.Println("Resta de flotante y entero:", result)
				return &floatPrimitive{Value: result}
			case *floatPrimitive:
				result := leftValue.(*floatPrimitive).Value - rightValue.(*floatPrimitive).Value
				fmt.Println("Resta de dos flotantes:", result)
				return &floatPrimitive{Value: result}
			}
		}

	case "*":
		switch leftValue.(type) {
		case *intPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*intPrimitive).Value * rightValue.(*intPrimitive).Value
				fmt.Println("Multiplicación de dos enteros:", result)
				return &intPrimitive{Value: result}
			case *floatPrimitive:
				result := float64(leftValue.(*intPrimitive).Value) * rightValue.(*floatPrimitive).Value
				fmt.Println("Multiplicación de entero y flotante:", result)
				return &floatPrimitive{Value: result} // Aquí devuelves un valor flotante
			}
		case *floatPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				result := leftValue.(*floatPrimitive).Value * float64(rightValue.(*intPrimitive).Value)
				fmt.Println("Multiplicación de flotante y entero:", result)
				return &floatPrimitive{Value: result}
			case *floatPrimitive:
				result := leftValue.(*floatPrimitive).Value * rightValue.(*floatPrimitive).Value
				fmt.Println("Multiplicación de dos flotantes:", result)
				return &floatPrimitive{Value: result}
			}
		}
	case "/":
		switch leftValue.(type) {
		case *intPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				rightInt := rightValue.(*intPrimitive).Value
				if rightInt != 0 {
					result := leftValue.(*intPrimitive).Value / rightInt
					fmt.Println("División de dos enteros:", result)
					return &intPrimitive{Value: result}
				} else {
					fmt.Println("Error: División por cero")
					// Aquí puedes manejar el error de división por cero según tus necesidades.
				}
			case *floatPrimitive:
				rightFloat := rightValue.(*floatPrimitive).Value
				if rightFloat != 0 {
					result := float64(leftValue.(*intPrimitive).Value) / rightFloat
					fmt.Println("División de entero y flotante:", result)
					return &floatPrimitive{Value: result}
				} else {
					fmt.Println("Error: División por cero")
					// Aquí puedes manejar el error de división por cero según tus necesidades.
				}
			}
		case *floatPrimitive:
			switch rightValue.(type) {
			case *intPrimitive:
				rightInt := rightValue.(*intPrimitive).Value
				if rightInt != 0 {
					result := leftValue.(*floatPrimitive).Value / float64(rightInt)
					fmt.Println("División de flotante y entero:", result)
					return &floatPrimitive{Value: result}
				} else {
					fmt.Println("Error: División por cero")
					// Aquí puedes manejar el error de división por cero según tus necesidades.
				}
			case *floatPrimitive:
				rightFloat := rightValue.(*floatPrimitive).Value
				if rightFloat != 0 {
					result := leftValue.(*floatPrimitive).Value / rightFloat
					fmt.Println("División de dos flotantes:", result)
					return &floatPrimitive{Value: result}
				} else {
					fmt.Println("Error: División por cero")
					// Aquí puedes manejar el error de división por cero según tus necesidades.
				}
			}
		}

	case "%":
		if leftInt, leftIsInt := leftValue.(*intPrimitive); leftIsInt {
			if rightInt, rightIsInt := rightValue.(*intPrimitive); rightIsInt {
				if rightInt.Value != 0 {
					result := leftInt.Value % rightInt.Value
					fmt.Println("Módulo de dos enteros:", result)
					return &intPrimitive{Value: result}
				} else {
					fmt.Println("Error: Módulo por cero")
					return nil
				}
			}
		}
}
return nil
}