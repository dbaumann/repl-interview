load.ivy("com.lihaoyi" %% "ammonite-shell" % ammonite.Constants.version)

import ammonite.repl._, Resolvers._ 
val typesafe = Resolver.Http(
  "Typesafe Repo",
  "http://repo.typesafe.com/typesafe/releases/",
  MavenPattern,
  true
)
resolvers() = resolvers() :+ typesafe
load.ivy("com.typesafe.play" %% "play-json" % "2.3.8")

// for debuggable assertions
load.ivy("com.lihaoyi" %% "utest" % "0.3.1")

@

val shellSession = ammonite.shell.ShellSession()
import shellSession._
import ammonite.shell.PPrints._
import ammonite.ops._
import ammonite.shell._
ammonite.shell.Configure(repl, wd)

def seedHistory(): Unit = {
  import play.api.libs.json.Json._

  val seed = read! home / ".ammonite" / "history_seed.scala"

  if(seed.nonEmpty) {
    val seedList = seed.split("\\n.+%separator%").toSeq.map(_.trim)
    write.over(home / ".ammonite" / "history", stringify(toJson(seedList)))
  }
}
seedHistory()

import utest._
import utest.ExecutionContext.RunNow

object TestContext {
  def apply(name: String)(test: => Unit) = {
    TestSuite(test).run().value.value
  }
}
