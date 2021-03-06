package gov.uk.justice.digital.pollpush.data

case class SourceCaseNote(noms_id: String, id: Int, content: String, contactTimestamp: String, notificationTimestamp: String, noteType: String, staffName: String, establishmentCode: String) {

  def toTarget = TargetCaseNote(
    TargetCaseNoteHeader(noms_id, id.toString),
    TargetCaseNoteBody(
      noteType,
      content,
      contactTimestamp,
      notificationTimestamp,
      staffName,
      establishmentCode
    )
  )
}
