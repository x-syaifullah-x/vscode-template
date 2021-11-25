fun main() {
    val width = 5
    val height = 5
    val pixelSize = 3
    val arrays = Array(height) {
        Array(width) {
            ByteArray(pixelSize) { 0 }
        }
    }

    for (pixels in arrays) {
        for (rgbs in pixels) {
            for (rgb in rgbs) {
                print(rgb)
            }
            print(" ")
        }
        println()
    }
}