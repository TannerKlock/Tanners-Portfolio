const displayedImage = document.querySelector('.displayed-img');
const thumbBar = document.querySelector('.thumb-bar');

const btn = document.querySelector('button');
const overlay = document.querySelector('.overlay');

/* Declaring the array of image filenames */
const imageNames = ['pic1.jpg', 'pic2.jpg', 'pic3.jpg', 'pic4.jpg', 'pic5.jpg']
const altText = {
'pic1.jpg' : 'Closeup of a human eye', 
'pic2.jpg' : 'Wavy rock', 
'pic3.jpg' : 'Blossoming flowers', 
'pic4.jpg' : 'Ancient Egyptian hieroglyphs', 
'pic5.jpg' : 'Butterfly on a leaf'}

/* Declaring the alternative text for each image file */

/* Looping through images */
imageNames.forEach((Element) => {
    const newImage = document.createElement('img');
    newImage.setAttribute('src', `${Element}`);
    newImage.setAttribute('alt', altText[Element]);
    thumbBar.appendChild(newImage);
    newImage.addEventListener('click', event => {
        displayedImage.src = event.target.src
    })
})

/* Wiring up the Darken/Lighten button */
btn.addEventListener('click', () => {
    const btnClass = btn.getAttribute('class')
    if (btnClass === 'dark') {
        btn.setAttribute('class', 'light')
        btn.textContent = 'Lighten'
        overlay.style.backgroundColor = 'rgb(0,0,0,0.5)'
    } else {
        btn.setAttribute('class', 'dark')
        btn.textContent = 'Darken'
        overlay.style.backgroundColor = 'rgb(0,0,0,0)'
    }
})