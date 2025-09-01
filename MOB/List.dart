void main() {
  // 🗂️ Data Collection: List
  List<int> angka = [10, 20, 30, 40, 50];

  // ➕ Operator Aritmatika
  int jumlah = angka[0] + angka[1];
  int selisih = angka[2] - angka[0];
  int hasilKali = angka[1] * 2; 
  double hasilBagi = angka[4] / 2;

  // 📝 Operator Penugasan
  angka[0] += 5;
  angka[1] -= 10;
  angka[2] *= 2;

  // 🔍 Operator Pembanding
  bool isLebihBesar = angka[2] > angka[0];
  bool isSama = angka[1] == 40;
  bool isTidakSama = angka[4] != angka[3]; 

  // 🔐 Operator Logika
  bool kondisi = true && false; 
  bool alternatif = true || false; 
  bool negasi_1 = !true;
  bool negasi_2 = !false;

  // ⬆️ increment & ⬇️ decrement
  int x = 5;
  int increment = x++;
  int decrement = x--;


  // 🖨️ Output semua hasil
  print('Jumlah: $jumlah');
  print('Selisih: $selisih');
  print('Hasil Kali: $hasilKali');
  print('Hasil Bagi: $hasilBagi');

  print('\n');

  print('Penugasan angka[0] += 5 → ${angka[0]}');
  print('Penugasan angka[1] *= 2 → ${angka[1]}');

  print('\n');

  print('Pembanding: angka[2] > angka[0] → $isLebihBesar');
  print('Pembanding: angka[1] == 40 → $isSama');
  print('Pembanding: angka[4] != angka[3] → $isTidakSama');
  
  print('\n');

  print('Logika AND: $kondisi');
  print('Logika OR: $alternatif');
  print('Logika NOT: $negasi_1');
  print('Logika NOT: $negasi_2');

  print('\n');

  print('increment (x++): $increment');
  print('decrement (x--): $decrement');
}