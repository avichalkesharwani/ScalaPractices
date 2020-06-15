package catsframework

object TestMonad extends App {


  // flatMap is most common function of monad
  val first = List(2, 5)
  val second = List(4, 8)

  //using Map
  println(first.map( e1 => second.map(e2 => e1 * e2)))

  //using flatMap
  println(first.flatMap( f => second.map(s => f * s)))

  // USe case for Monad
  /*
  case class Grade(id:Int, studentId:Int, grade: String)
  case class Student(id: Int, name: String)
  case class StudentCourse(id:Int,
                           studentId: Int,
                           courseId:  Int)
  object StudentService{
    def getStudentById(id: Int): Option[Student] = {}
  }
  object StudentCoursesService{
    def getCourses(student: Student): Option[List[StudentCourse]]={}
  }
  object StudentGrades{
    def getGrades(lc: List[StudentCourse]): Option[List[Grade]]={}
  }
  */

  /* How to use it
  val studentGrade = StudentService.getStudentById(id)
    .flatMap(getCourses)
    .flatMap(getGrades)
  */


  /*
  Cats Effect
  added another requirement to all cats library monad implementation, called tailRecM ( Tail recursive Monad),
  the reason behind this additional requirement is to make monadic recursion stack safe( since monadic recursion
  are quite common and a poor implementation could lead to stack overflow on the jvm ).
   */




}
