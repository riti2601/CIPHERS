
<h1>Diffie-Hellman Key Exchange</h1>

<p>This repository contains a Java implementation of the Diffie-Hellman key exchange protocol, a secure method for exchanging cryptographic keys over a public channel.</p>

<h2>Current Implementation</h2>

<h3>Diffie-Hellman Key Exchange</h3>
<ul>
    <li><strong>Key Generation:</strong> The program allows two parties to generate a shared secret key by exchanging public keys derived from their secret numbers and a common base and modulus (prime numbers).</li>
    <li><strong>Security:</strong> The protocol ensures that the shared key is secure, even if the public keys are transmitted over an insecure channel.</li>
</ul>

<h2>Example</h2>
<p>Here is a quick example of how the Diffie-Hellman key exchange works in this program:</p>
<ol>
    <li><strong>Input:</strong> 
        <ul>
            <li>Person A's Secret Number: <code>5</code></li>
            <li>Person B's Secret Number: <code>7</code></li>
            <li>Prime Numbers: <code>23</code> and <code>9</code> (Base and Modulus)</li>
        </ul>
    </li>
    <li><strong>Process:</strong> 
        <ul>
            <li>Person A calculates their public key: <code>A = 9^5 mod 23</code></li>
            <li>Person B calculates their public key: <code>B = 9^7 mod 23</code></li>
            <li>They exchange their public keys.</li>
            <li>Each calculates the shared secret key using the other’s public key and their own private key:</li>
            <li>Person A’s Secret Key: <code>k1 = B^5 mod 23</code></li>
            <li>Person B’s Secret Key: <code>k2 = A^7 mod 23</code></li>
        </ul>
    </li>
    <li><strong>Output:</strong> 
        <ul>
            <li>Shared Secret Key: <code>k1 = k2</code></li>
        </ul>
    </li>
</ol>

<h2>How to Run</h2>

<ol>
    <li><strong>Clone the repository:</strong>
        <pre><code>git clone https://github.com/yourusername/diffie-hellman-key-exchange.git</code></pre>
    </li>
    <li><strong>Navigate to the project directory:</strong>
        <pre><code>cd diffie-hellman-key-exchange</code></pre>
    </li>
    <li><strong>Compile the Java file:</strong>
        <pre><code>javac dh.java</code></pre>
    </li>
    <li><strong>Run the program:</strong>
        <pre><code>java dh</code></pre>
    </li>
</ol>

<h2>Contributions</h2>
<p>Contributions are welcome! If you have ideas for improvements or additional features, feel free to open an issue or submit a pull request.</p>

<h2>License</h2>
<p>This project is open-source and available under the <a href="LICENSE">MIT License</a>.</p>

<hr>

<p><em>Stay tuned for more updates!</em></p>

<p align="center">
    <em>Developed by RITISHA PANDE</em>
</p>