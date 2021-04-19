# AirConditioner
project extended by new functionalities,
- AirConditioner can also heat instead of cooling only
- weather affect on building 
- single Thread solution (not perfect)
- multithread solution idea - would be better than single thread.
(for now i think that design patern - observer would be redundant here)
- multithread solution done


----------------------------------------------------------------------------------------------------
treść zadania (polecam javastart.pl)
Napisz program, który będzie symulował regulację temperatury w pomieszczeniach pewnego budynku.

Budynek składa się z 4 pomieszczeń, a każde pomieszczenie może posiadać niezależny klimatyzator jednego z dwóch typów:

BasicAirConditioner - obniża temperaturę pomieszczenia proporcjonalnie o 1 stopień na minutę przy wydajności 1 metra sześciennego na minutę. 
Przykładowo jeśli pomieszczenie ma kubaturę 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,1 stopnia na minutę.
ProAirConditioner - obniża temperaturę pomieszczenia proporcjonalnie o 2 stopnie na minutę przy wydajności 1 metra sześciennego na minutę  
Przykładowo jeśli pomieszczenie ma kubaturę 10 metrów sześciennych, to temperatura pomieszczenia będzie obniżana o 0,2 stopnia na minutę.
Na potrzeby zadania symulujemy, że 1 minuta odpowiada 1 sekundzie.

W każdym pomieszczeniu można ustawić klimatyzację na włączoną lub wyłączoną oraz temperaturę do której temperatura ma zostać obniżona.

Program powinien co sekundę wyświetlić temperaturę w każdym z czterech pomieszczeń. Co sekundę temperatura w pomieszczeniu powinna być obniżana 
o odpowiednią wartość w zależności od zastosowanego klimatyzatora. Załóż dowolną temperaturę początkową. Po obniżeniu temperatury do zadanej, 
powinna ona być utrzymywana na stałym poziomie.

Zagadnienia przydatne do rozwiązania: definiowanie klas, metod i obiektów, polimorfizm, tablice, pętle, instrukcje sterujące.
