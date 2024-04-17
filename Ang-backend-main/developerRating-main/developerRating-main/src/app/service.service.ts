import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  getUser(): Observable<any>{
   return  this.http.get(`${environment.apiUrl}/getall`);
  }

  addCategory(Categories: any): Observable<any>{
    return  this.http.post(`${environment.apiUrl}/add`, Categories);
   }

  //  getUsers(Categories: any){
  //   this.http.get(`'http://localhost:8080/boot/user/'`);

  //}
}
