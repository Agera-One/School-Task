# Mengimpor modul calendar
import calendar

# Menginput tahun dan bulan
yy = int(input("Masukan Tahun : "))
mm = int(input("Masukan Bulan : "))

# Menampilkan kalender bulan
print(calendar.month(yy, mm))