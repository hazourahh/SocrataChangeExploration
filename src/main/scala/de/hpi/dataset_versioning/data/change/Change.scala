package de.hpi.dataset_versioning.data.change

import java.time.LocalDate

import de.hpi.dataset_versioning.data.simplified.Attribute

case class Change(t:LocalDate, e:Long, pID:Int, prevValue:Any, newValue:Any) {
  def isDelete: Boolean = prevValue != None && newValue == None

  def isUpdate = prevValue != None && newValue != None

  def isInsert = prevValue == None && newValue != None

  def getValueTuple = (prevValue,newValue)

}
