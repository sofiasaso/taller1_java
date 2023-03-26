print ("Bienvenido a Craps")
print ("************************************")
print ("Las reglas son las siguientes:")
print ("Ganas si obtienes un par de unos en los dados")
print ("Ganas si obtienes un total de tres en los dados")
print ("Ganas si obtienes un total de once en los dados")
print ("Ganas si obtienes un dos o doce en los dados")
print ("Ganas si obtienes un total de siete en los dados")


import random
import string
jugar_nuevamente ="S"


while jugar_nuevamente=="S" or jugar_nuevamente=="s":
    print("Empiezas con 50000 pesitos, si ganas obtendrás otros 50000 pesitos, si sigues jugando irás aumentando tu fortuna uwu")
    print("De lo contrario, perderás todo")
    print("Buena suerte!!!")
    str(input("Presiona enter para lanzar los dados :)"))
    puntaje = 50000
    dado1 = random.randint(1,6)
    dado2 = random.randint(1,6)
    total = dado1 + dado2
    print ("Has obtenido un puntaje de: ", dado1,"en el primer dado, en el segundo, has obtenido un valor de: ",dado2)
    print ("Un total de ",total )
    if dado1==1 and dado2==1:
        print ("Haz ganado! Felicidades")
        puntaje = puntaje + 50000
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    elif total==3:
        print("Haz ganado! Felicidades")
        puntaje = puntaje + 50000
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    elif total==11:
        print("Haz ganado! Felicidades")
        puntaje = puntaje + 50000
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    elif total==2 or total==12:
        print("Haz ganado! Felicidades")
        puntaje = puntaje + 50000
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    elif total==7:
        print("Haz ganado! Felicidades")
        puntaje = puntaje + 50000
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    else:
        print("Lo siento, haz perdido")
        puntaje = puntaje - puntaje
        print ("Obtuviste un total de: ", puntaje, "pesitos")
    
    jugar_nuevamente = string.capwords(input("Deseas jugar nuevamente? Presiona S o s para continuar: "))
str(input("Presiona enter para salir"))
print("\n© Programa Diseñado por Laura Sofía Sánchez")
print("SENA - Tecnólogo en Análisis y Desarrollo de Software ADSO")

