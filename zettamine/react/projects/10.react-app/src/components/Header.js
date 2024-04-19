import React from 'react'
import Logo from '../assets/logo.png'
const Header = () => {
  return (
    <header>
      <a href="https://www.zettamine.com" target="_blank">
        <img src={Logo} alt="company logo"/>
      </a>
      <a href='#'>HOME</a>
    </header>
  )
}

export default Header
