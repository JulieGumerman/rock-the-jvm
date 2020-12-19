package lectures

import java.time.LocalDateTime

case class Channel(name: String)

case class TVPackage(name: String, channels: Set[Channel])

sealed trait Plan
case object Monthly extends Plan
case object BiAnnual extends Plan
case object Annual extends Plan

case class Subscription (
                        name: String,
                        defaultTVPackages: Map[TVPackage, Plan],
                        additionalTVPackages: Map[TVPackage, Plan],
                        additionalChannels: Map[Channel, Plan],
                        startDate: LocalDateTime,
                        endDate: LocalDateTime
                        )
object DthDemo extends App {

  val channelOne = Channel("One")
  val channelTwo = Channel("Two")
  val channelSportsOne = Channel("SportsOne")
  val channelSportsTwo = Channel("SportsTwo")

  val tvPackageGen = TVPackage("GenPack", Set(channelOne, channelTwo, channelSportsTwo))
  val tvPackageSports = TVPackage("SportsPack", Set(channelSportsOne, channelSportsTwo))
}
