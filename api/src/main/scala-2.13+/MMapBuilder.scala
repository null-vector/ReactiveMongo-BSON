package reactivemongo.api.bson

import org.eclipse.collections.impl.map.mutable.UnifiedMap

import scala.jdk.CollectionConverters.MapHasAsScala

object MMapBuilder {

  def empty[K, V](): scala.collection.mutable.Map[K, V] =
    new UnifiedMap[K, V]().asScala
}
