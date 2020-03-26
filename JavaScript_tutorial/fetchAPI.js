const text = document.querySelector('#getText');
text.addEventListener('click', (e) => {
    fetch('sample.txt')
    .then((response) => response.text())
    .then((data) => {
        document.querySelector('#output').innerHTML = data;
    })
    .catch((error) => console.log(error));
});

const users = document.querySelector('#getUsers');
users.addEventListener('click', (e) => {
    fetch('users.json')
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        let output = '<h2>Users</h2>';
        
        data.forEach((user) => {
            output += `
                <ul class="list-group mb-3">
                    <li class="list-group-item">ID: ${user.id}</li>
                    <li class="list-group-item">Name: ${user.name}</li>
                    <li class="list-group-item">Email: ${user.email}</li>
                </ul>
            `;
        });
        document.querySelector('#outputUsers').innerHTML = output;

    })
    .catch((error) => console.log(error));
});


const posts = document.querySelector('#getPosts');
posts.addEventListener('click', (e) => {
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then((response) => response.json())
    .then((data) => {
        console.log(data);
        let output = '<h2>Posts</h2>';
        
        data.forEach((post) => {
            output += `
                <div class="card card-body mb-3">
                    <h4>${post.title}</h4>
                    <p>post by ${post.userID}</p>
                    <p>${post.body}</p>
                </div>
            `;
        });
        document.querySelector('#outputPosts').innerHTML = output;

    })
    .catch((error) => console.log(error));
});

const submits = document.querySelector('#addPost');
submits.addEventListener('submit', (e) => {
    e.preventDefault();
    
    let title = document.querySelector('#title').Value;
    let body = document.querySelector('#body').Value;

    fetch('https://jsonplaceholder.typicode.com/posts', {
        method:'POST',
        headers: {
            'Accept':'application/json, text/plain, */*',
            'Content-type':'application/json'
        },
        body:JSON.stringify({title:title, body:body})
    })
    .then((res) => res.json())
    .then((data) => console.log(data));
});
