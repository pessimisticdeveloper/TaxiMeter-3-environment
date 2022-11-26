print("HOŞ GELDİNİZ.")

tutar = 0
minTutar = 20
acilisUcret = 10
km = 2.20

kac_km = int(input("NEREYE GİDECEKSİNİZ? (KM): "))

if kac_km <=0:
    print("yolculuk iptal edildi. teşekkürler.")
elif kac_km <10:
    print(f"ödenecek tutar: {minTutar} TL")
    print("yolculuk sona erdi, iyi günler dileriz.")
elif kac_km >10:
    tutar = (kac_km * km)  + acilisUcret
    print(f"ödenecek tutar: {tutar} TL")
    print("yolculuk sona erdi, iyi günler dileriz.")
else:
    print("yolculuk iptal edildi, teşekkürler.")
