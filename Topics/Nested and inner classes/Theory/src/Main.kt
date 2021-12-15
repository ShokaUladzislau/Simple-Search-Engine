// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  class Pumpkin (val isForHalloween: Boolean){

      fun addCandle() {
          if (isForHalloween) {
              val candle = Candle()
              candle.burning()
          }
          else {
              println("We don't need a candle.")
          }
      }


    inner class Candle() {
        fun burning(){

        }
    }
  }

}
