object List {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(42); 
  val a = List[Int](1,2,3,4);System.out.println("""a  : <error> = """ + $show(a ))}
  
}
