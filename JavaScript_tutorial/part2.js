// console.log(window);

// const items = document.querySelectorAll('.item');
// items.forEach((item) => console.log(item));

// const ul = document.querySelector('.items');
// // ul.remove()
// // ul.lastElementChild.remove();
// // ul.firstElementChild.remove();
// ul.firstElementChild.textContent = 'Hello';
// ul.children[1].innerHTML = 'Brad';

const btn = document.querySelector('.btn');

const myForm = document.querySelector('#my-form');
const nameInput = document.querySelector('#name');
const emailInput = document.querySelector('#email');
const msg = document.querySelector('.msg');
const userList = document.querySelector('#users');

myForm.addEventListener('submit', onSubmit);

function onSubmit(e) {
    e.preventDefault();

    if(nameInput.value === ''  || emailInput.value === '') {
        msg.classList.add('error');
        msg.innerHTML = 'Please enter all fields';

        setTimeout(() => msg.innerHTML = '', 3000);
    } else{
        console.log('success');

        const li = document.createElement('li');
        li.appendChild(document.createTextNode(`${nameInput.value} : ${emailInput.value}`))
        
        userList.appendChild(li);
        
        // Clear fields
        nameInput.value = '';
        emailInput.value = '';
    }
}

btn.addEventListener('click', (e) => {
    // e.preventDefault();
    // document.querySelector('body').classList.add('bg-dark');
    // document.querySelector('.items').lastElementChild.innerHTML = '<h1>Hello</h1>';
     console.log(e);
});

btn.addEventListener('mouseover', (e) => {
    myForm.style.background = '#ccc';
});

btn.addEventListener('mouseout', (e) => {
    myForm.style.background = '#f4f4f4';
});

btn.style.background = "red";

