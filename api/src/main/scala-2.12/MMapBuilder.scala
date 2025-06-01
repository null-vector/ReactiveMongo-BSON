package reactivemongo.api.bson

import org.eclipse.collections.impl.map.mutable.UnifiedMap

import scala.collection.JavaConverters

final object MMapBuilder {

  def empty[K, V](): scala.collection.mutable.Map[K, V] =
    JavaConverters.mapAsScalaMapConverter(new UnifiedMap[K, V]()).asScala
}
