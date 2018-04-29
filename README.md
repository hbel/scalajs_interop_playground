# scalajs_interop_playground
Playing around with the interoperability between scala (JVM), scala.js and js.

1. Build scala-backend with *sbt compile* to make sure it compiles
2. Build sjs-frontend with *sbt fastOptJS* to create the scala.js frontend part
3. Make sure to create a link from *sjs-frontend/target/scala-2.12/sjs-frontend-fastopt.js* to *js-frontend/src* to enable usage 
of the scala.js code (and enable hot reloading of the frontend app if you change the scala code).
4. Start the react frontend as usual with *yarn start*
