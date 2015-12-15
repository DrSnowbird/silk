package org.silkframework.workspace.activity

import org.silkframework.dataset.{EntitySink, LinkSink, DataSink, DataSource}
import org.silkframework.runtime.activity.Activity

/**
  * Executes a task.
  */
abstract class TaskExecutor[DataType] {

  def apply(inputs: Seq[DataSource], taskData: DataType, linkOutputs: Seq[LinkSink], entityOutputs: Seq[EntitySink]): Activity[_]
}