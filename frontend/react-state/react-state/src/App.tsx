import './App.css'
import {useState} from "react";

export default function App() {

    return (
        <>
            <h1>My App</h1>
            <Counter/>
            <Counter/>
            <Counter/>
        </>
    )
}

function Counter() {
    const [count, setCount] = useState(0)// [besondere Variable, Setterfunction]
    const [isDarkTheme, setIsDarkTheme] = useState(false);
    const [obj, setObj] = useState({name: "Obi", age: 33});


    function handleClick() {
        console.log('clicked...');
        if (count < 1) {

            setCount(count + 1);
        }
        console.log(count);
        console.log(obj);
        setObj({...obj, age: obj.age + 1})

    }

    function handleToggleTheme() {
        setIsDarkTheme(!isDarkTheme);
    }

    //let count: number = 0;
    return (
        <section className={isDarkTheme ? "dark" : ""}>
            <h2>You clicked {count} times</h2>
            <button disabled={count > 0} onClick={handleClick}>Click me</button>
            <button onClick={handleToggleTheme}>Toggle Theme</button>
        </section>
    )
}


