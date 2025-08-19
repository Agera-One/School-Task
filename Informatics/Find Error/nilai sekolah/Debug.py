# Menginput nilai tugas UTS dan UAS
tugas = float(input("masukkan nilai tugas : "))
uts = float(input("masukkan nilai UTS : "))
uas = float(input("masukkan nilai UAS : "))

# Menghitung nilai akhir sesuai dengan bobot
nilai = (0.15*tugas) + (0.35*uts) + (0.50*uas)

# Menentukan grade berdasarkan nilai akhir
if nilai > 80:
  grade = 'A'
elif nilai > 70:
  grade = 'B'
elif nilai > 60:
  grade = 'C'
elif nilai > 50:
  grade = 'D'
else:
  grade = 'E'

# Menentukan status kelulusan berdasarkan nilai akhir
if nilai > 60:
  status = 'Lulus'
else:
  status = 'Tidak Lulus'

# Menampilkan nilai akhir, grade, dan status kelulusan
print('Nilai Akhir : %0.2f' % nilai)
print('Grade : ', format(grade))
print('Status : ', format(grade))