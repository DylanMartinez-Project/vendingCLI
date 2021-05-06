document.addEventListener('DOMContentLoaded', 

    () => {
        const elem1 = document.getElementById('elem1');
        elem1.addEventListener('click', respondToElement);

        const elem2 = document.getElementById('elem2');
        elem2.addEventListener('mouseenter', respondToElement);
   
        const elem3 = document.getElementById('elem3');
        elem3.addEventListener('dblclick', respondToElement);

    }
);

function respondToElement(evt) {
    console.log(evt.target);
}


