# Rail Fence Cipher

This repository contains a simple Java implementation of the Rail Fence Cipher, a transposition cipher that rearranges the characters of a plaintext message based on a certain pattern.

## Overview

### How It Works
- **Encryption:** The input data is divided into two parts—characters at even indices and characters at odd indices. The even-indexed characters are concatenated first, followed by the odd-indexed characters, to form the encrypted message.

### Example
For example, if the input is `"HELLO WORLD"`, the encryption process would:
- **Even-indexed characters:** `"HLOWRD"`
- **Odd-indexed characters:** `"EL OL"`
- **Encrypted output:** `"HLOWRDEL OL"`

## How to Run

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/rail-fence-cipher.git
    ```
2. **Navigate to the project directory:**
    ```bash
    cd rail-fence-cipher
    ```
3. **Compile the Java file:**
    ```bash
    javac rf.java
    ```
4. **Run the program:**
    ```bash
    java rf
    ```

## Example Usage

After running the program, you will be prompted to enter your name, age, and the data you wish to encrypt. The program will then output the encrypted data using the Rail Fence Cipher technique.

### Sample Input/Output

- **Input:**
    ```
    Name: Alice
    Age: 21
    Data: HELLO WORLD
    ```

- **Output:**
    ```
    The encrypted data is: HLOWRDEL OL
    ```


## Contributions
Contributions are welcome! If you have ideas for improvements or additional features, feel free to open an issue or submit a pull request.

## License
This project is open-source and available under the [MIT License](LICENSE).

---

*Stay tuned for more updates!*
<p align="center">
    <em>Developed by RITISHA PANDE</em>
</p>