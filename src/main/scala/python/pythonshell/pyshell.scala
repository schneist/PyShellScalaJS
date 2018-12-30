package python.pythonshell

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSImport("python-shell", JSImport.Namespace)
object PythonShellJS extends js.Object{

  type PythonShellJSIO = String|Seq[Byte]

  @js.native
  object PythonShell extends js.Object {

    /**
      *
      * @param pathToScript
      * @param options
      * @param callback
      * @return The PythonShell instance
      * Runs the Python script and invokes callback with the results. The callback contains the execution error (if any) as well as an array of messages emitted from the Python script.
      *
      * This method is also returning the PythonShell instance.
      */
    def run(pathToScript:String,options:PythonShellOptions,callback:js.Function2[js.UndefOr[String],js.UndefOr[PythonShellJSIO],Unit]) : PythonShell = js.native
    def runString(Script:String,options:PythonShellOptions,callback:js.Function2[js.UndefOr[String], js.UndefOr[PythonShellJSIO] ,Unit]) :PythonShell = js.native

  }

  @js.native
  class PythonShell extends js.Object {

    def send(input: PythonShellJSIO) : Unit = js.native

    def on(event :String, function1: PythonShellJSIO => Unit)  :Unit = js.native

    // the path of the script to execute
    def script() : String = js.native

    def command() : String = js.native // the full command arguments passed to the Python executable
    def stdin() : String = js.native //  the Python stdin stream, used to send data to the child process
    def stdout () : String = js.native //  the Python stdout stream, used for receiving data from the child process
    def stderr() : String = js.native //  the Python stderr stream, used for communicating logs & errors
    def childProcess() : String = js.native //  the process instance created via child_process.spawn
    def terminated() : Boolean = js.native //  boolean indicating whether the process has exited
    def exitCode() : String = js.native //  the process exit code, available after the process has ended

  }

  trait PythonShellOptions extends js.Object {
    val mode: js.UndefOr[ String] = js.undefined
    val pythonPath : js.UndefOr[String] = js.undefined
    val scriptPath : js.UndefOr[String] = js.undefined
    val pythonOptions : js.UndefOr[Seq[String]] = js.undefined
    val encoding : js.UndefOr[String] = js.undefined
    val args : js.UndefOr[Seq[String]] = js.undefined
  }
}


