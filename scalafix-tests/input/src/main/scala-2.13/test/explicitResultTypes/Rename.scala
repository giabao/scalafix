/*
rules = ExplicitResultTypes
*/
package test.explicitResultTypes

import scala.collection.immutable.{Seq => SSeq}
import java.lang.{Boolean => JBoolean}

object Rename {
  type Seq = Int
  def foo(a: Int*) = identity(a)
  def foo = identity(JBoolean.TRUE)
}
