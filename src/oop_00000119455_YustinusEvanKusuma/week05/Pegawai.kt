package oop_00000119455_YustinusEvanKusuma.week05

abstract class Pegawai (val nama: String) {
    // Abstract function tidak memiliki body (tanpa kurung kurawal) -> abstract function tidak boleh ada isi
    // Abstract kurang lebih kek open bedanya abvtract tidak bisa buat objek (open bisa) dan abstract harus di override (open tidak). open tujuannya supaya bisa di wariskan, abstract itu adalah template aja
    abstract fun bekerja()
}