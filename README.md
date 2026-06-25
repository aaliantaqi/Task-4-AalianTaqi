# Currency Converter (Java)

A simple console-based currency converter built in Java. Convert between **USD**, **INR**, and **PKR** using fixed exchange rates, with input validation to handle invalid entries gracefully.

## Features
- Convert between USD, INR, and PKR
- Input validation for menu choices and amounts (rejects negative numbers, zero, and non-numeric input)
- Loops until valid input is provided — no crashes on bad input

## How to Run

```bash
javac DecodeLabs_Java_P4_v2.java
java DecodeLabs_Java_P4_v2
```

## Usage

1. Select the currency you currently have (1 = USD, 2 = INR, 3 = PKR)
2. Enter the amount you want to convert
3. Select the currency you want to convert to
4. View the converted amount

## Exchange Rates (fixed, for demo purposes)

| Currency | Rate (relative to USD) |
|----------|------------------------|
| USD      | 1                      |
| PKR      | 300                    |
| INR      | 90                     |

> Note: Rates are hardcoded and not pulled from a live API.

## Tech
- Java (uses `Scanner` for input, `try/catch` for input validation)

## License
Feel free to use or modify this project for learning purposes.
