const url = '/api/user'
const urlHeader = '/api/header'
const header = document.getElementById('header')
const headerRoles = document.getElementById('headerRoles')
const tBody = document.querySelector('tbody')
let result = ''

function getAuthenticationForUserPage() {
    fetch(urlHeader)
        .then(response => response.json())
        .then(user => {
            const text = user.username
            const text2 = ' with roles: ' + user.roles.map(r => r.name.replaceAll('ROLE_', ''))
            header.innerHTML = text
            headerRoles.innerHTML = text2
        })
}

getAuthenticationForUserPage()

const showTable = (user) => {
    result += `<tr>
        <td>${user.id}</td>   
        <td>${user.username}</td>
        <td>${user.lastName}</td>
        <td>${user.age}</td>
        <td>${user.roles.map(r => r.name.replaceAll('ROLE_', ''))}</td>
        </tr>`
    tBody.innerHTML = result
}

fetch(url)
    .then(response => response.json())
    .then(data => showTable(data))
    .catch(error => console.log(error))