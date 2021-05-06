document.addEventListener('DOMContentLoaded',
    () => {
        
        const btn = document.getElementById('cool');
        btn.addEventListener('click', annoy);

        const l1Box = document.getElementById('l1');
        l1Box.addEventListener('click', annoy);

        const l2Box = document.getElementById('l2');
        l2Box.addEventListener('click', annoy);

        const l3Box = document.getElementById('l3');
        l3Box.addEventListener('click', annoy);
    }
);

function annoy() {

    window.alert('Do you want to save money on insurance?');

}