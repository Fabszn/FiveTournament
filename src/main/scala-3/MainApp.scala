import zio.*
import zio.http.*

object MainApp extends ZIOAppDefault {

  override def run =
    Server.serve(services.httpServer.app).provide(Server.default)

}
