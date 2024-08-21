<h1 align="center">Caesar Cipher</h1>

<p align="center">
    <em>A simple Java program to encrypt and decrypt data using the Caesar Cipher method.</em>
</p>

<hr>

<h2>Features</h2>
<ul>
    <li><strong>Encrypt Data:</strong> The program allows you to encrypt text using a Caesar Cipher by shifting characters a specified number of positions.</li>
    <li><strong>Decrypt Data:</strong> It also provides the ability to decrypt text that was previously encrypted using the same shifting method.</li>
</ul>

<h2>How It Works</h2>
<ol>
    <li>The user is prompted to enter their name and age.</li>
    <li>If the user is younger than 18, the program will exit, displaying a message that they are too young to hide anything.</li>
    <li>If the user is 18 or older, they are asked whether they want to encrypt or decrypt data:
        <ul>
            <li><strong>For encryption:</strong> The user is prompted to enter the data they want to encrypt and a number between 1 and 9 to be used as the shift value.</li>
            <li><strong>For decryption:</strong> The user is asked to enter the encrypted data and the number used for encryption.</li>
        </ul>
    </li>
    <li>The program will then display the encrypted or decrypted data accordingly.</li>
</ol>

<h2>How to Use</h2>
<ol>
    <li><strong>Compile the program:</strong>
        <pre><code>javac caeserCipher.java</code></pre>
    </li>
    <li><strong>Run the program:</strong>
        <pre><code>java caeserCipher</code></pre>
    </li>
    <li><strong>Follow the on-screen prompts:</strong>
        <ul>
            <li>Enter your name and age.</li>
            <li>Choose between encryption and decryption.</li>
            <li>Provide the necessary inputs based on your choice.</li>
        </ul>
    </li>
</ol>

<h2>Example</h2>

<h3>Encryption:</h3>
<pre><code>Hello User! 
Enter your name and age:
John
25
Welcome John!
Do you want to encrypt data or decrypt the data?
For encryption enter: 1
For decryption enter: 2
1

Please enter the data that is to be encrypted, we will be using Caesar Cipher to encrypt the data.
hello world
Choose any number between 1 to 9:
3
Encrypted data: khoor*zruog
</code></pre>

<h3>Decryption:</h3>
<pre><code>Hello User! 
Enter your name and age:
John
25
Welcome John!
Do you want to encrypt data or decrypt the data?
For encryption enter: 1
For decryption enter: 2
2

Please enter the data that is to be decrypted, we will be using Caesar Cipher to decrypt the data.
khoor*zruog
Enter the number between 1 to 9 which was used for encryption before:
3
Decrypted data: hello world
</code></pre>

<hr>

<p align="center">
    <em>Developed by [Your Name]</em>
</p>
