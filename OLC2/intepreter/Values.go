package intepreter
const (
IntType = "Int"
FloatType = "Float"
StringType = "String"
BooleanType = "Bool"
CharType = "Character"
NilType = "nil"
)
type PRIMITIVE interface{
GetValue() interface{}
GetType() string
}
type intPrimitive struct{
Value int64
}
func (i *intPrimitive) GetValue() interface{}{
return i.Value
}
func (i *intPrimitive) GetType() string{
return IntType
}
type floatPrimitive struct{
Value float64
}
func (f *floatPrimitive) GetValue() interface{}{
return f.Value
}
func (f *floatPrimitive) GetType() string{
return FloatType
}
type stringPrimitive struct{
Value string
}
func (s *stringPrimitive) GetValue() interface{}{
return s.Value
}
func (s *stringPrimitive) GetType() string{
return StringType
}
type booleanPrimitive struct{
Value bool
}
func (b *booleanPrimitive) GetValue() interface{}{
return b.Value
}
func (b *booleanPrimitive) GetType() string{
return BooleanType
}
type charPrimitive struct{
Value rune
}
func (c *charPrimitive) GetValue() interface{}{
return c.Value
}
func (c *charPrimitive) GetType() string{
return CharType
}
type nilPrimitive struct{}
func (n *nilPrimitive) GetValue() interface{}{
return nil
}
func (n *nilPrimitive) GetType() string{
return NilType
}
