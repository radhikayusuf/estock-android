package id.estock.app.presentation.splash

class Test{

    companion object {

        fun main() {
            val input = "aaaddd"
            val map: HashMap<String, Int?> = HashMap()



            for (i in 0 until input.length){
                if (map[(input[i]).toString()] == null){
                    map[(input[i]).toString()] = 1
                } else {
                    map[(input[i]).toString()] = 1 + (map[(input[i]).toString()]?:0)
                }
            }


            var higher = "-"
            var max = 0

            for (i in 0 until map.keys.size) {
                val key = map.keys.elementAt(map.keys.size - (i + 1))
                if((map[key]?:0) > max){
                    max = map[key]?:0
                    higher = key
                }
            }


            System.out.println("Testnya $higher")
        }
    }

}
