# Java Encryption Techniques

This repository contains Java implementations of classic encryption techniques, starting with the Caesar Cipher and MonoAlphabetic Cipher.

## Current Implementations

### Caesar Cipher
- **Encryption:** The program takes input data and shifts each character by a user-defined number to encrypt the data.
- **Decryption:** It also allows you to decrypt data by reversing the shift, returning the original message.

### MonoAlphabetic Cipher
- **Encryption:** The program encrypts the input data by substituting each character with a corresponding character in a predefined key.
- **Decryption:** It decrypts the data by mapping the encrypted characters back to their original characters using the key.

### Diffie-Hellman Key Exchange
<ul>
    <li><strong>Key Generation:</strong> The program allows two parties to generate a shared secret key by exchanging public keys derived from their secret numbers and a common base and modulus (prime numbers).</li>
    <li><strong>Security:</strong> The protocol ensures that the shared key is secure, even if the public keys are transmitted over an insecure channel.</li>
</ul>

## Future Plans
I plan to extend this repository with more encryption and decryption techniques, as well as other interesting algorithms in Java.

## How to Run

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/encryption-techniques.git
    ```
2. **Navigate to the project directory:**
    ```bash
    cd encryption-techniques
    ```
3. **Compile the Java file:**
    ```bash
    javac caeserCipher.java monoAlpha.java
    ```
4. **Run the program:**
    ```bash
    java caeserCipher
    ```
    ```bash
    java monoAlpha
    ```

## Contributions
Contributions are welcome! If you have ideas for improvements or additional features, feel free to open an issue or submit a pull request.

## License
This project is open-source and available under the [MIT License](LICENSE).


*Stay tuned for more updates!*
