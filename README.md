# Palindrome Checker

## Опис програми:

Ця програма призначена для перевірки, чи є введене слово паліндромом. Паліндром - це слово, яке читається однаково як зліва направо, так і справа наліво. Програма ігнорує регістр літер і пробіли, щоб коректно визначити паліндроми.

## Опис роботи:

Програма використовує наступні кроки для визначення, чи є слово паліндромом:

1. Видаляє всі пробіли зі слова.
2. Преобразує всі літери у слові до нижнього регістру.
3. Використовує клас `StringBuilder` для ефективного перевертання слова.
4. Порівнює оригінальне слово з його перевернутим варіантом.

### Використані методи:

- `isPalindrome(String word)`: Основний метод, який приймає слово у вигляді рядка і повертає `true`, якщо воно є паліндромом, і `false` - у протилежному випадку.
- `replaceAll("\\s", "")`: Видаляє всі пробіли зі слова.
- `toLowerCase()`: Перетворює всі літери у слові до нижнього регістру.
- `reverse()`: Перевертає рядок за допомогою `StringBuilder`.

### Застосування принципу "Five Why's":

1. **Чому програма видаляє пробіли?**
   - Щоб паліндром можна було перевірити правильно, ігноруючи пробіли.

2. **Чому всі літери перетворюються в нижній регістр?**
   - Це робить програму більш гнучкою, оскільки регістр літер не впливає на паліндром.

3. **Чому використовується `StringBuilder` для перевертання рядка?**
   - Це дозволяє ефективно порівнювати оригінальне слово та його перевернуту версію.

4. **Чому програма повертає `true` для паліндрому і `false` для не паліндрому?**
   - Це стандартний спосіб повідомлення користувачу про результат перевірки.

## Про тести:

Тестування функціональності програми включає наступні сценарії:

- Перевірка правильного визначення паліндрому для слів, таких як "level".
- Перевірка ігнорування регістру літер для введення типу "Able was I saw eLba".
- Перевірка визначення не паліндрому для слів, таких як "hello".
- Перевірка роботи програми з фразами, що містять пробіли, наприклад, "A man a plan a canal Panama".
