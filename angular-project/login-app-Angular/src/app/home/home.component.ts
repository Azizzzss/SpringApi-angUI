import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/AuthService';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent  implements OnInit {

  ngOnInit(): void {


  }

  constructor(private authService :AuthService ){

  }


  handleLogout(){


    this.authService.logout();

  }




}
