// addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("me.lessis" % "np" % "0.2.0")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

resolvers += "ls-sbt-resolver-0" at "http://repo.lessis.me"

resolvers += "ls-sbt-resolver-1" at "http://repo.codahale.com"

resolvers ++= Seq(
  Resolver.url("sbt-plugin-releases", new URL(
    "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
      Resolver.ivyStylePatterns),
  "coda" at "http://repo.codahale.com"
)

// resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

// addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.5.0")

// addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.0")

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

// addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")
