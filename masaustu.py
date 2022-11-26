from tkinter import *

window = Tk()
window.title("-TAKSİMETRE-")
window.geometry("300x200")


l3 = Label(window,)
l3.place(x=100,y=150)

tutar = 0
acilisUcret = 10
km = 2.20
minTutar = 20

def hesapla():
    mesafe = e1.get()
    mesafe = int(mesafe)
    if mesafe <= 0:
        l3.config(text="Yolculuk İptal Edildi, \n Teşekkürler.")
    elif mesafe < 10:
        l3.config(text=f"Ödenecek Tutar \n {minTutar} TL.")
    elif mesafe > 10:
        tutar = (mesafe * km) + acilisUcret
        l3.config(text=f"Ödenecek Tutar \n {tutar} TL. ")
    else:
        l3.config(text="Yolculuk İptal Edildi. ")


l1 = Label(window, text="HOŞGELDİNİZ.")
l1.place(x=120, y=15)

e1 = Entry(window, width=25)
e1.place(x=80,y=45)

bt = Button(window, text="HESAPLA", padx="20",pady="5", command=hesapla)
bt.place(x=100,y=80)



window.mainloop()