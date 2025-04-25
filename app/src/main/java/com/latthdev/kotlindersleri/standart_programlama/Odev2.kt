package com.latthdev.kotlindersleri.standart_programlama



fun main() {
    fun convertToFahrenheit(c : Int): Double {
        if(c < -273) {
            println("Geçersiz Değer, mutlak sıfırın altına inemezsiniz");
        }
        return (c * 1.8) + 32;
    }

    fun calculatePerimeter(length: Double, width: Double): Double {
        if(length < 0 || width < 0) {
            throw IllegalArgumentException("Köşeler Negatif Olamaz");
        }
        return 2 * (length + width);
    }

    fun calculateFactorial(n: Int): Int {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * (n-1);
    }

    fun calculateAInSentence(sentence : String) : Int {
        var aCount = 0;
        for (char in sentence) {
            if (char == 'a' || char == 'A') {
                aCount++;
            }
        }
        return aCount;
    }

    fun calculateArea(sides : Int) : Double {
        if(sides < 3) {
            throw IllegalArgumentException("Köşeler Negatif Olamaz");
        }
        return (sides - 2) * 180.0;
    }

    fun calculateSalary(days : Int) : Double {
        if (days < 0) {
            throw IllegalArgumentException("Gün Sayısı Negatif Olamaz");
        }

        var hourlyPay = 10.0;
        var hoursWorked = 8;
        var extraWorkPay = 20;
        var extraWorkLimit = 160;
        var salary = 0.0;
        var workedTotalHours = days * hoursWorked;

        if (workedTotalHours > extraWorkLimit) {
            var extraWorkHours = workedTotalHours - extraWorkLimit;
            return (extraWorkLimit * hourlyPay) + (extraWorkHours * extraWorkPay);
        } else {
            return days * hourlyPay * hoursWorked;
        }
    }

    fun calculateInternetLimit(usedInternet : Double) : Double {
        val limit = 50.0;
        val limitPrice = 100.0;
        val extraPayment = 4.0;

        if(usedInternet > limit) {
            val extraLimit = usedInternet - limit;
            return (limitPrice + (extraLimit * extraPayment));
        } else {
            return limitPrice;
        }
    }

    println("Fahrenheit: ${convertToFahrenheit(25)}");

    println("Perimeter: ${calculatePerimeter(5.0, 10.0)}");

    println("Factorial: ${calculateFactorial(5)}");

    println("A Count: ${calculateAInSentence("Bu bir test cümlesidir.")}");

    println("Area: ${calculateArea(5)}");

    println("Salary: ${calculateSalary(20)}");

    println("Internet Limit: ${calculateInternetLimit(60.0)}");

}