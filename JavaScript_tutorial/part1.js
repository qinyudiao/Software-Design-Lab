// Class
class Person {
    constructor(firstName, lastName, dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob);
    }

    getBirthYear() {
        return this.dob.getFullYear();
    }

    getFullName() {
        return `${this.firstName} ${this.lastName}`;
    }
}

// Instantiate object
const person1 = new Person('John', 'Green', '4-3-1980')
const person2 = new Person('Kobe', 'Bryant', '8-23-1978')

console.log(person1.getBirthYear());
console.log(person1.getFullName());

console.log(person1)