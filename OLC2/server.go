package main
import (
"github.com/gofiber/fiber/v2"
"proy1/routes"
)
func main(){
	app := fiber.New()
	app.Post("/parser",routes.Analyzer("mariano"))
	app.Listen(":3000")
}