import org.joda.time.{DateTime, Days}


val xmas = (new DateTime).withHourOfDay(13).withMinuteOfHour(0)
val h = xmas.plusMinutes(45)

val s = h.toString("hh:mm a")