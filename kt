// Define the Produk class
class Produk(
    val nama: String,
    var harga: Double,
    var stok: Int,
    val deskripsi: String,
    val kategori: String,
    val berat: Double,
    val supplier: String
) {
    fun tampilkanInformasi() {
        println("Nama Produk: $nama")
        println("Harga: Rp. $harga")
        println("Stok: $stok")
        println("Deskripsi: $deskripsi")
        println("Kategori: $kategori")
        println("Berat: $berat kg")
        println("Supplier: $supplier")
    }

    fun beliProduk(jumlah: Int) {
        if (jumlah > stok) {
            println("Stok tidak mencukupi!")
        } else {
            stok -= jumlah
            println("Anda telah membeli $jumlah $nama. Sisa stok: $stok")
        }
    }
}

fun main() {
    // Membuat objek dari class Produk
    val produk1 = Produk(
        nama = "Laptop Gaming",
        harga = 15000000.0,
        stok = 10,
        deskripsi = "Laptop dengan spesifikasi tinggi untuk gaming",
        kategori = "Elektronik",
        berat = 2.5,
        supplier = "PT. Teknologi Maju"
    )

    // Memanggil fungsi untuk menampilkan informasi produk
    produk1.tampilkanInformasi()

    // Melakukan simulasi pembelian produk
    produk1.beliProduk(3)
    produk1.tampilkanInformasi()
}
