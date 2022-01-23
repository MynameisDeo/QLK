<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags"%>
<mt:template_user title="Jsgrid">
	<jsp:attribute name="content">
	<section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>jsGrid</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">jsGrid</li>
            </ol>
          </div>
        </div>
      </div>
			<!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">jsGrid</h3>
        </div>
        <!-- /.card-header -->
       <div class="card-body">
          <div id="jsGrid1" class="jsgrid"
						style="position: relative; height: 100%; width: 100%;">
						<div class="jsgrid-grid-header jsgrid-header-scrollbar">
							<table class="jsgrid-table">
								<tr class="jsgrid-header-row">
									<th class="jsgrid-header-cell jsgrid-header-sortable"
										style="width: 100px;">ID</th>
										<th class="jsgrid-header-cell jsgrid-header-sortable"
										style="width: 100px;">Name</th>
									<th
										class="jsgrid-header-cell jsgrid-align-right jsgrid-header-sortable"
										style="width: 100px;">category_id</th>
									<th class="jsgrid-header-cell jsgrid-header-sortable"
										style="width: 100px;">price</th>
									<th
										class="jsgrid-header-cell jsgrid-align-center jsgrid-header-sortable"
										style="width: 100px;">quantity</th>
									<th
										class="jsgrid-header-cell jsgrid-align-center jsgrid-header-sortable"
										style="width: 100px;">created</th>
										<th class="jsgrid-header-cell jsgrid-header-sortable"
										style="width: 100px;">description</th>
										<th
										class="jsgrid-header-cell jsgrid-align-center jsgrid-header-sortable"
										style="width: 100px;">status</th>
								</tr>
								<tr class="jsgrid-filter-row" style="display: none;">
									<td class="jsgrid-cell" style="width: 150px;"><input
										type="text"></td>
									<td class="jsgrid-cell jsgrid-align-right" style="width: 50px;"><input
										type="number"></td>
									<td class="jsgrid-cell" style="width: 200px;"><input
										type="text"></td>
									<td class="jsgrid-cell jsgrid-align-center"
										style="width: 100px;"><select><option value="0"></option>
											<option value="1">United States</option>
											<option value="2">Canada</option>
											<option value="3">United Kingdom</option>
											<option value="4">France</option>
											<option value="5">Brazil</option>
											<option value="6">China</option>
											<option value="7">Russia</option></select></td>
									<td class="jsgrid-cell jsgrid-align-center"
										style="width: 100px;"><input type="checkbox" readonly=""></td>
								</tr>
								<tr class="jsgrid-insert-row" style="display: none;">
									<td class="jsgrid-cell" style="width: 150px;"><input
										type="text"></td>
									<td class="jsgrid-cell jsgrid-align-right" style="width: 50px;"><input
										type="number"></td>
									<td class="jsgrid-cell" style="width: 200px;"><input
										type="text"></td>
									<td class="jsgrid-cell jsgrid-align-center"
										style="width: 100px;"><select><option value="0"></option>
											<option value="1">United States</option>
											<option value="2">Canada</option>
											<option value="3">United Kingdom</option>
											<option value="4">France</option>
											<option value="5">Brazil</option>
											<option value="6">China</option>
											<option value="7">Russia</option></select></td>
									<td class="jsgrid-cell jsgrid-align-center"
										style="width: 100px;"><input type="checkbox"></td>
								</tr>
							</table>
						</div>
						<div class="jsgrid-grid-body" style="height: 821px;">
							<table class="jsgrid-table">
								<tbody>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Otto Clay</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">61</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #897-1459 Quam Avenue</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">China</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Connor Johnston</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">73</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #370-4647 Dis Av.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Russia</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Lacey Hess</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">29</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #365-8835 Integer St.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Russia</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Timothy Henson</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">78</td>
										<td class="jsgrid-cell" style="width: 200px;">911-5143 Luctus Ave</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Ramona Benton</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">43</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #614-689 Vehicula Street</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Brazil</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Ezra Tillman</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">51</td>
										<td class="jsgrid-cell" style="width: 200px;">P.O. Box 738, 7583 Quisque St.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Dante Carter</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">59</td>
										<td class="jsgrid-cell" style="width: 200px;">P.O. Box 976, 6316 Lorem, St.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Christopher Mcclure</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">58</td>
										<td class="jsgrid-cell" style="width: 200px;">847-4303 Dictum Av.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Ruby Rocha</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">62</td>
										<td class="jsgrid-cell" style="width: 200px;">5212 Sagittis Ave</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Canada</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Imelda Hardin</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">39</td>
										<td class="jsgrid-cell" style="width: 200px;">719-7009 Auctor Av.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Brazil</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Jonah Johns</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">28</td>
										<td class="jsgrid-cell" style="width: 200px;">P.O. Box 939, 9310 A Ave</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Brazil</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Herman Rosa</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">49</td>
										<td class="jsgrid-cell" style="width: 200px;">718-7162 Molestie Av.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Russia</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Arthur Gay</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">20</td>
										<td class="jsgrid-cell" style="width: 200px;">5497 Neque Street</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Russia</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Xena Wilkerson</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">63</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #303-6974 Proin Street</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Lilah Atkins</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">33</td>
										<td class="jsgrid-cell" style="width: 200px;">622-8602 Gravida Ave</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Brazil</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Malik Shepard</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">59</td>
										<td class="jsgrid-cell" style="width: 200px;">967-5176 Tincidunt Av.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Keely Silva</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">24</td>
										<td class="jsgrid-cell" style="width: 200px;">P.O. Box 153, 8995 Praesent Ave</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">United States</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Hunter Pate</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">73</td>
										<td class="jsgrid-cell" style="width: 200px;">P.O. Box 771, 7599 Ante, Road</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Russia</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-row">
										<td class="jsgrid-cell" style="width: 150px;">Mikayla Roach</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">55</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #438-9886 Donec Rd.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">Brazil</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
									<tr class="jsgrid-alt-row">
										<td class="jsgrid-cell" style="width: 150px;">Upton Joseph</td>
										<td class="jsgrid-cell jsgrid-align-right"
											style="width: 50px;">48</td>
										<td class="jsgrid-cell" style="width: 200px;">Ap #896-7592 Habitant St.</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;">France</td>
										<td class="jsgrid-cell jsgrid-align-center"
											style="width: 100px;"><input type="checkbox" disabled=""></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="jsgrid-pager-container">
							<div class="jsgrid-pager">Pages: <span
									class="jsgrid-pager-nav-button jsgrid-pager-nav-inactive-button"><a
									href="javascript:void(0);">First</a></span> <span
									class="jsgrid-pager-nav-button jsgrid-pager-nav-inactive-button"><a
									href="javascript:void(0);">Prev</a></span> <span
									class="jsgrid-pager-page jsgrid-pager-current-page">1</span><span
									class="jsgrid-pager-page"><a href="javascript:void(0);">2</a></span><span
									class="jsgrid-pager-page"><a href="javascript:void(0);">3</a></span><span
									class="jsgrid-pager-page"><a href="javascript:void(0);">4</a></span><span
									class="jsgrid-pager-page"><a href="javascript:void(0);">5</a></span> <span
									class="jsgrid-pager-nav-button"><a
									href="javascript:void(0);">Next</a></span> <span
									class="jsgrid-pager-nav-button"><a
									href="javascript:void(0);">Last</a></span> &nbsp;&nbsp; 1 of 5 </div>
						</div>
						<div class="jsgrid-load-shader"
							style="display: none; position: absolute; inset: 0px; z-index: 1000;"></div>
						<div class="jsgrid-load-panel"
							style="display: none; position: absolute; top: 50%; left: 50%; z-index: 1000;">Please, wait...</div>
					</div>
        </div>
        <!-- /.card-body -->
      </div>
      <!-- /.card -->
    </section>
    <!-- /.content -->
    </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="float-right d-none d-sm-block">
      <b>Version</b> 3.2.0-rc
    </div>
    <strong>Copyright &copy; 2014-2021 <a
				href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>

<!-- ./wrapper -->
	</jsp:attribute>
</mt:template_user>