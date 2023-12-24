import zio.*

object MainApp extends ZIOAppDefault {

    override def run: ZIO[Any with ZIOAppArgs with Scope, Any, Any] = ZIO.logInfo("Hello Wordl")
}
