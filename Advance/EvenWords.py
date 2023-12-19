file = open('doc.txt', 'r')
content = file.read()
file.close()

words = content.split()
even_length_words = []

for word in words:
    if len(word) % 2 == 0:
        even_length_words.append(word)

result = ' '.join(even_length_words)
print(result)
